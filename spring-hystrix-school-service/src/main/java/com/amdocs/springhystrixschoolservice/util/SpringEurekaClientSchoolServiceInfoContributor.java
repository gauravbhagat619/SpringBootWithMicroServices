package com.amdocs.springhystrixschoolservice.util;

import java.util.Collections;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;

public class SpringEurekaClientSchoolServiceInfoContributor implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		builder.withDetail("details",
				Collections.singletonMap("description", "This is the School service, which is discovery server aware,"
						+ " and this service will Call Student Microservice, fro student details, which is again"
						+ " dicovery server aware!!! "));
		
	}

}
