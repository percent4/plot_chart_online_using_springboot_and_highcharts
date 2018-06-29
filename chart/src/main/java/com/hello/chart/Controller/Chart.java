package com.hello.chart.Controller;

public class Chart {

    private String chartType;
    private String xdata;
    private String ydata;
    private String title;
    private String xlabel;
    private String ylabel;

    Chart() {}
    Chart(String chartType, String xdata, String ydata,String title, String xlabel, String ylabel) {
        this.chartType = chartType;
        this.xdata = xdata;
        this.ydata = ydata;
        this.title = title;
        this.xlabel = xlabel;
        this.ylabel = ylabel;
    }

    public String getChartType() {
        return chartType;
    }

    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    public String getXdata() {
        return xdata;
    }

    public void setXdata(String xdata) {
        this.xdata = xdata;
    }

    public String getYdata() {
        return ydata;
    }

    public void setYdata(String ydata) {
        this.ydata = ydata;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getXlabel() {
        return xlabel;
    }

    public void setXlabel(String xlabel) {
        this.xlabel = xlabel;
    }

    public String getYlabel() {
        return ylabel;
    }

    public void setYlabel(String ylabel) {
        this.ylabel = ylabel;
    }

}
