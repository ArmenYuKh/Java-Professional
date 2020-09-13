// Создайте классы Currency, Parser, Main
// Подключиться к NBU API(https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json)
// и вывести в консоль 3 валюты на выбор

package add_task.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Currency {
    @JsonIgnore
    private int r030;

    @JsonIgnore
    private String txt;

    @JsonProperty("cc")
    private String from;

    private final String to = "UAH";

    @JsonProperty("rate")
    private BigDecimal rate;

    @JsonProperty("exchangedate")
    private String date;

    public Currency() {
    }

    public Currency(int r030, String txt, String from, BigDecimal rate, String date) {
        this.r030 = r030;
        this.txt = txt;
        this.from = from;
        this.rate = rate;
        this.date = date;
    }

    public int getR030() {
        return r030;
    }

    public void setR030(int r030) {
        this.r030 = r030;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", rate=" + rate +
                ", date='" + date + '\'' +
                '}';
    }
}
