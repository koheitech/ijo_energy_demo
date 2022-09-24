package com.example.demo.energy;

import javax.persistence.*;

@Entity
@Table
public class Energy {
    @Id
    @SequenceGenerator(
            name = "energy_sequence",
            sequenceName = "energy_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "energy_sequence"
    )
    private Long id;
    private String cpu;
    private String  gpu;
    private String  resolution;
    private Boolean power;
    private String  network;
    private String  memory;

    public Energy() {
    }

    public Energy(Long id, String cpu, String gpu, String resolution, Boolean power, String network, String memory) {
        this.id = id;
        this.cpu = cpu;
        this.gpu = gpu;
        this.resolution = resolution;
        this.power = power;
        this.network = network;
        this.memory = memory;
    }

    public Energy(String cpu, String gpu, String resolution, Boolean power, String network, String memory) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.resolution = resolution;
        this.power = power;
        this.network = network;
        this.memory = memory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Boolean getPower() {
        return power;
    }

    public void setPower(Boolean power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Energy{" +
                "id=" + id +
                ", cpu=" + cpu +
                ", gpu=" + gpu +
                ", resolution=" + resolution +
                ", power=" + power +
                ", network=" + network +
                ", memory=" + memory +
                '}';
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
