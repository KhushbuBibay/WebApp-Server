package com.khush.weatherapp.service

import com.sun.deploy.net.HttpResponse
import org.springframework.stereotype.Service

@Service
class ExtractWeatherServiceImpl implements ExtractWeatherService {

    @Override
    void extractWeatherData(Object cityName) {
        HttpResponse<String> response = Unirest.get("https://community-open-weather-map.p.rapidapi.com/weather?q=$cityName&lat=0&lon=0&callback=test&id=2172797&lang=null&units=%22metric%22%20or%20%22imperial%22&mode=xml%2C%20html")
                .header("x-rapidapi-key", "16a2457962msh46abe6e15100360p1e6489jsndeeb2f161f0f")
                .header("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
                .asString();
    }
}
