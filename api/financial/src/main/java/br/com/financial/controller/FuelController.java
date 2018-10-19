package br.com.financial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.financial.arq.FinancialController;
import br.com.financial.domain.Fuel;

@RestController
@RequestMapping("fuel")
public class FuelController extends FinancialController<Fuel>{}


