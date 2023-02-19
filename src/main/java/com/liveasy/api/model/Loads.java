package com.liveasy.api.model;

import jakarta.persistence.*;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;


//    private String loadingPoint;
//
//
//    private String unloadingPoint;
//
//
//    private String productType;
//
//
//    private String truckType;
//
//
//    private Integer noOfTrucks;
//
//
//    private Integer weight;
//
//    private String comment;
//
//    @Id
//    private Long shipperId;
//
//
//    private String date;

    @Entity

    public class Loads {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(name = "loading_point")
        private String loadingPoint;

        @Column(name = "unloading_point")
        private String unloadingPoint;

        @Column(name = "product_type")
        private String productType;

        @Column(name = "truck_type")
        private String truckType;

        @Column(name = "no_of_trucks")
        private int noOfTrucks;

        @Column(name = "weight")
        private int weight;

        @Column(name = "comment")
        private String comment;

        @Column(name = "shipper_id")
        private String shipperId;

        @Column(name = "date")
        private String date;

        // getters and setters for each property


    public Loads() {
        super();
    }

        public Long getId() {
            return id;
        }

        public String getLoadingPoint() {
        return loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public Integer getNoOfTrucks() {
        return noOfTrucks;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getComment() {
        return comment;
    }
        public String getShipperId() {
            return shipperId;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setNoOfTrucks(int noOfTrucks) {
            this.noOfTrucks = noOfTrucks;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public void setNoOfTrucks(Integer noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
        public void setShipperId(String shipperId) {
            this.shipperId = shipperId;
        }




        public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }


    @Override
    public String toString() {
        return "Loads{" +
                "loadingPoint='" + loadingPoint + '\'' +
                ", unloadingPoint='" + unloadingPoint + '\'' +
                ", productType='" + productType + '\'' +
                ", truckType='" + truckType + '\'' +
                ", noOfTrucks=" + noOfTrucks +
                ", weight=" + weight +
                ", comment='" + comment + '\'' +
                ", shipperId='" + shipperId + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}




