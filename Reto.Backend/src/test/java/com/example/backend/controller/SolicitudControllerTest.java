package com.example.backend.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.backend.entity.Solicitud;
import com.example.backend.service.impl.ServiceSolicitudImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
@ExtendWith(SpringExtension.class)
@WebMvcTest(SolicitudController.class)
@AutoConfigureMockMvc(addFilters = false) //for disabling secruity, remove if not needed
class SolicitudControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
    @MockBean
	private ServiceSolicitudImpl userRepository;


	@Test
	public void createStudentCourse() throws Exception {
		
	   Solicitud solicitud = new Solicitud();
	 solicitud.setId(8);
	 solicitud.setPost_id(2);
	 solicitud.setName("asdasdsad");
	 solicitud.setEmail("asdasdasd");
	 solicitud.setBody("asdasdasdasd");
	 Mockito.when(userRepository.GuardarSolicitud(Mockito.any(Solicitud.class))).thenReturn(solicitud);
	   Gson gson = new Gson();
	   String jsonString = gson.toJson(solicitud);
	   

	   
	   mockMvc.perform(MockMvcRequestBuilders.post("/api/Solicitud/Guardar")
			   .contentType(MediaType.APPLICATION_JSON)
			    .content(jsonString)
			    .characterEncoding("utf-8"))
			    .andExpect(status().isOk())
			    .andReturn();
   }
}
