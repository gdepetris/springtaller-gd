package com.gian.tallerspring;

import org.springframework.stereotype.*;
import java.util.List;
import org.springframework.data.*;

@Service
public class ServiceImpl {

	public List<Cliente> findByLastname(Cliente cliente) {
	
		return List<Cliente>;
		
	}
	
}

//He planteado la entidad, tendriamos que crear el repositorio de spring data.

//Luego tendriamos que acceder a dicho repositorio y llamar a los datos.

//Por ultimo, en el servicio, se filtrará mediante un metodo por nombre y apellido utilizando spring data.

//Mas o menos comprendo el funcionamiento de Spring, sin embargo, me faltan dominio de java como para terminar de implementarlo.

