package com.aluracursos.screenmatch.google;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class GenAIConexion {
    public static void Prueba() {
        Client client = Client.builder()
                .apiKey("AIzaSyDP9UlR595hQt78YtFeaFHpS1OiGlHlbpM")
                .build();

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.0-flash",
                        "HOLA",
                        null
                );
        System.out.println(response.text());
    }
}
