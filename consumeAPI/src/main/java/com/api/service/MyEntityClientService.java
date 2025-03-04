package com.api.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.dto.MyEntity;

@Service
public class MyEntityClientService {

	@Autowired
	private RestTemplate restTemplate;

	private final String BASE_URL = "http://localhost:8080/";

	// 1. Get All Records
	public List<MyEntity> getAllRecords() {
		String url = BASE_URL+"/get";
		System.out.println("url is ---->>>"+url);
		ResponseEntity<MyEntity[]> response = restTemplate.getForEntity(url, MyEntity[].class);
		return Arrays.asList(response.getBody());
	}

	// 2. Save a New Record
	public MyEntity createRecord(MyEntity entity) {
		ResponseEntity<MyEntity> response = restTemplate.postForEntity(BASE_URL, entity, MyEntity.class);
		return response.getBody();
	}

	// 3. Update a Record
	public MyEntity updateRecord(Long id, MyEntity entity) {
		/*
		 * HttpHeaders headers = new HttpHeaders();
		 * headers.setContentType(MediaType.APPLICATION_JSON); HttpEntity<MyEntity>
		 * requestEntity = new HttpEntity<>(entity, headers);
		 * 
		 * ResponseEntity<MyEntity> response = restTemplate.exchange(BASE_URL + "/" +
		 * id, HttpMethod.PUT, requestEntity, MyEntity.class); return
		 * response.getBody();
		 */
		restTemplate.put(BASE_URL + "/" + id, entity);
		return entity;
	}

	// 4. Delete a Record
	public void deleteRecord(Long id) {
		/*
		 * ResponseEntity<String> response = restTemplate.exchange(BASE_URL + "/" + id,
		 * HttpMethod.DELETE, null, String.class); return response.getBody();
		 */
		restTemplate.delete(BASE_URL + "/" + id);
	}
}
