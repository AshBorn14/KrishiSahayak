package com.project.agroworldapp.network;

import com.project.agroworldapp.articles.model.CropsResponse;
import com.project.agroworldapp.articles.model.DiseasesResponse;
import com.project.agroworldapp.articles.model.FlowersResponse;
import com.project.agroworldapp.articles.model.FruitsResponse;
import com.project.agroworldapp.articles.model.HowToExpandResponse;
import com.project.agroworldapp.articles.model.InsectControlResponse;
import com.project.agroworldapp.weather.model.weather_data.WeatherResponse;
import com.project.agroworldapp.weather.model.weatherlist.WeatherDatesResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    //https://api.openweathermap.org/data/2.5/weather?lat=19.075975&lon=72.87738&appid=92f4e9a9c233be99f0b33d1c58c72386
    //https://api.openweathermap.org/data/2.5/forecast?lat=44.34&lon=10.99&appid=92f4e9a9c233be99f0b33d1c58c72386
    //https://sheetdb.io/api/v1/4hm2n4jziczjy

    @GET("weather")
    Call<WeatherResponse> getWeatherData(
            @Query("lat") Double lat,
            @Query("lon") Double lon,
            @Query("appid") String apiKey);

    @GET("forecast")
    Call<WeatherDatesResponse> getWeatherForecastData(
            @Query("lat") Double lat,
            @Query("lon") Double lon,
            @Query("appid") String apiKey);

    @GET("https://sheetdb.io/api/v1/sz6m5c3xavzkm")
    Call<List<DiseasesResponse>> getDiseasesList();
    @GET("https://sheetdb.io/api/v1/sz6m5c3xavzkm?sheet=sheet2")
    Call<List<DiseasesResponse>> getLocalizedDiseasesList();
    @GET("sz6m5c3xavzkm?sheet=sheet9")
    Call<List<FruitsResponse>> getFruitsFromDB();
    @GET("sz6m5c3xavzkm?sheet=sheet10")
    Call<List<FruitsResponse>> getLocalizedFruitsList();
    @GET("sz6m5c3xavzkm?sheet=sheet7")
    Call<List<FlowersResponse>> getFlowersList();
    @GET("sz6m5c3xavzkm?sheet=sheet8")
    Call<List<FlowersResponse>> getLocalizedFlowersList();
    @GET("sz6m5c3xavzkm?sheet=sheet5")
    Call<List<CropsResponse>> getListOfCrops();
    @GET("sz6m5c3xavzkm?sheet=sheet6")
    Call<List<CropsResponse>> getLocalizedCropsList();
    @GET("sz6m5c3xavzkm?sheet=sheet11")
    Call<List<HowToExpandResponse>> getListOfHowToExpandData();
    @GET("sz6m5c3xavzkm?sheet=sheet12")
    Call<List<HowToExpandResponse>> getLocalizedHowToExpandData();
    @GET("https://sheetdb.io/api/v1/sz6m5c3xavzkm?sheet=sheet3")
    Call<List<InsectControlResponse>> getInsectAndControlList();
    @GET("sz6m5c3xavzkm?sheet=sheet4")
    Call<List<InsectControlResponse>> getLocalizedInsectAndControlList();
}
