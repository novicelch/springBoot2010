package com.lch.sbd.modules.test.Service;

import com.lch.sbd.modules.test.entity.Country;

public interface CountryService {

	Country getCountryById(int countryId);
	
	Country getCountryByName(String countryName);
}
