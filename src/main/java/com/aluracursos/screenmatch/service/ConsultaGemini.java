package com.aluracursos.screenmatch.model;

import ch.qos.logback.core.net.server.Client;
import com.google.genai.types.GenerateContentResponse;

public class ConsultaGemini {
    public static String obtenerTraduccion(String texto){
        String modelo = "gemini-2.0-flash-lite";
        String prompt = "Traduce el siguiente texto al español: " + texto;

        Client cliente = new Client.Builder().apiKey("AIzaSyDCVV2ucadFm211VR9fHbEoh3LL2eThDkg").build;

        try {
            GenerateContentResponse respuesta = cliente.models.generateContent(
                    modelo,
                    prompt,
                    null
            );
            if (!respuesta.text().isEmpty()) {
                return respuesta.text();
            }
        } catch (Exception e) {
            System.err.println("Error al llamar a la API de Gemini para traducción: " e.getMessage());
        }

        return null;
    }
}
