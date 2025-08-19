package com.tunahaninci.havadurumu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {
    private List<WeatherItem> weatherList;

    public WeatherAdapter() {
        this.weatherList = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_weather, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        WeatherItem weather = weatherList.get(position);
        holder.cityName.setText(weather.getCityName());
        holder.temperature.setText(String.format("%.1f°C", weather.getTemperature()));
    }

    @Override
    public int getItemCount() {
        return weatherList.size();
    }

    public void addWeatherItem(WeatherItem item) {
        weatherList.add(item);
        notifyItemInserted(weatherList.size() - 1);
    }

    public void clearData() {
        weatherList.clear();
        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView cityName, temperature;

        ViewHolder(View itemView) {
            super(itemView);
            cityName = itemView.findViewById(R.id.tv_city_name);
            temperature = itemView.findViewById(R.id.tv_temperature);
        }
    }
}
