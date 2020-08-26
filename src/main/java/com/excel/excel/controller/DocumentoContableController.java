package com.excel.excel.controller;


import com.excel.excel.service.DocumentoContableService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentoContableController {

    private DocumentoContableService service;

	public DocumentoContableController(final DocumentoContableService service) {
		this.service = service;
	}

}
