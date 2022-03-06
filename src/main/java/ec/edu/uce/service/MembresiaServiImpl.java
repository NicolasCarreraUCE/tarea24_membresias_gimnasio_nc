package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Membresia;
import ec.edu.uce.repository.IMembresiaRepo;

@Service
public class MembresiaServiImpl implements IMembresiaServi {

	@Autowired
	private IMembresiaRepo membresiaRepo;

	@Override
	public void insertarMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		this.membresiaRepo.insertarMembresia(membresia);
	}

	@Override
	public Membresia obtenerMembresia(Integer id) {
		// TODO Auto-generated method stub
		return this.membresiaRepo.obtenerMembresia(id);
	}

	@Override
	public void actualizarMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		this.membresiaRepo.actualizarMembresia(membresia);
	}

	@Override
	public void borrarMembresia(Integer id) {
		// TODO Auto-generated method stub
		this.membresiaRepo.borrarMembresia(id);
	}

	@Override
	public Membresia buscarMembresiaPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.membresiaRepo.buscarMembresiaPorCodigo(codigo);
	}
	
}
