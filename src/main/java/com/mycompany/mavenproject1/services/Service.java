/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.services;

import com.mycompany.mavenproject1.model.Pessoa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Admin
 */
@Path("service")
public class Service {
    
    //simula base de dados
    public static Map<Integer, Pessoa> pessoas = new HashMap<Integer, Pessoa>();
    
    @GET
    @Path("/getPessoaByIdXML/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Pessoa getPessoaByIdXML(@PathParam("id")int id){
        return pessoas.get(id);
    }
    
    @GET
    @Path("/getPessoaByIdJSON/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Pessoa getPessoaByIdJSON(@PathParam("id")int id) {
        return pessoas.get(id);
    }
    
    @GET
    @Path("/getAllPessoasInXML")
    @Produces(MediaType.APPLICATION_XML)
    public List<Pessoa>getAllPessoasInXML() {
        return new ArrayList<Pessoa>(pessoas.values());
    }
    
}

