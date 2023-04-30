package pe.edu.cibertec.appbasededatos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.appbasededatos.model.bd.Estado;
import pe.edu.cibertec.appbasededatos.repository.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository EstadoRepository;
	
	public List<Estado>listarEstado(){
		return EstadoRepository.findAll();		
	}
	
	public void registrarEstado(Estado estado) {
		EstadoRepository.save(estado);
	}

}
