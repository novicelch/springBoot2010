package com.lch.sbd.modules.test.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lch.sbd.modules.test.dao.CountryDao;
import com.lch.sbd.modules.test.entity.Country;
import com.lch.sbd.modules.test.Service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	private CountryDao countryDao;

	@Override
	public Country getCountryById(int countryId) {
		return countryDao.getCountryById(countryId);
	}

	@Override
	public Country getCountryByName(String countryName) {
		return countryDao.getCountryByName(countryName);
	}

}
