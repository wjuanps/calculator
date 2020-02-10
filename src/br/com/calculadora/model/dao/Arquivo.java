/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculadora.model.dao;

import br.com.calculadora.model.vo.Historico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sophia
 */
public final class Arquivo {
    /**
     *
     */
    public static final String path 
            = System.getProperty("user.dir").concat(File.separator.concat("src").concat(File.separator.concat("historico.txt")));
    /**
     * 
     */
    private static final Charset utf8 = StandardCharsets.UTF_8;
    
    /**
     * 
     * @param operacao 
     */
    public static void salvarHistorico(String operacao) {
        final Historico h = new Historico(operacao);
        final List<Historico> iterator = (getHistorico().isEmpty()) ? new ArrayList<>() : getHistorico();
        iterator.add(h);
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path), utf8)) {
            for (Historico historico : iterator) {
                writer.write(historico.getOperacao().concat("\n"));
            }
        } catch (IOException ex) {
        	ex.printStackTrace();
        }
    }
    
    /**
     * 
     * @return 
     */
    private static List<Historico> getHistorico() {
        final List<Historico> historicos = new ArrayList<>();
        
        if (!Files.exists(Paths.get(path))) {
            try {
                Files.createFile(Paths.get(path));
            } catch (IOException ex) {
            	ex.printStackTrace();
            }
        }
        
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path), utf8)) {
            String line;
            while((line = reader.readLine()) != null) {
                historicos.add(new Historico(line));
            }
        } catch (IOException ex) {
        	ex.printStackTrace();
        }
        return historicos;
    }
}
