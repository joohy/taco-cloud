package com.action.in.taco.cloud.api.controller;


import com.action.in.datastore.repository.TacoRepository;

public class RecentTacosController {
    private TacoRepository tacoRepo;

    public RecentTacosController(TacoRepository tacoRepo) {
        this.tacoRepo = tacoRepo;
    }
}
