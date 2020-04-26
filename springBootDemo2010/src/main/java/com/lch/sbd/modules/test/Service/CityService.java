package com.lch.sbd.modules.test.Service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.lch.sbd.modules.common.vo.Result;
import com.lch.sbd.modules.test.entity.City;

public interface CityService {

	List<City> getCitiesByCountryId(int countryId);
	
	PageInfo<City> getCitiesByPage(int currentPage, int pageSize, int countryId);
	
	City getCityByName(String cityName, String localCityName);
	
	Result<City> insertCity(City city);
	
	Result<City> updateCity(City city);
	
	Result<Object> deleteCity(int cityId);
}
