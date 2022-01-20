package com.demo.demoSpringInizializer.service;

import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.demo.demoSpringInizializer.model.DataStateLocation;

@Service
public class CovidRestDataService {
    
	private static String VIRUS_DATA_URL = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";
	private List<DataStateLocation> allRecord = new ArrayList<DataStateLocation>();
	
	public List<DataStateLocation> getAllRecord() {
		return allRecord;
	}

	public void setAllRecord(List<DataStateLocation> allRecord) {
		this.allRecord = allRecord;
	}

	@PostConstruct
	@Scheduled(cron="* * 1 * * *")
	public void fetchVirusData() throws IOException, InterruptedException {
		List<DataStateLocation> listRecord= new ArrayList<DataStateLocation>();
		
		HttpClient httpClient = HttpClient.newHttpClient();
			HttpRequest request =  (HttpRequest) HttpRequest.newBuilder().uri(URI.create(VIRUS_DATA_URL))
					.build();
		 
				HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
				System.out.println(response.body());
				StringReader csvreaderbody=new StringReader(response.body());
				Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvreaderbody);
				for (CSVRecord record :records) {
					DataStateLocation locationStat = new DataStateLocation();
		             
					    locationStat.setState(record.get("Province/State"));
			            locationStat.setCountry(record.get("Country/Region"));
			            int latestCases = Integer.parseInt(record.get(record.size() - 1));
			            int prevDayCases = Integer.parseInt(record.get(record.size() - 2));
			            
			            locationStat.setLastTotalCase(latestCases);
			            locationStat.setDiffFromPrevDay(latestCases - prevDayCases);
			            listRecord.add(locationStat);
				 }
				
				setAllRecord(listRecord);
			 
	}
	
}
