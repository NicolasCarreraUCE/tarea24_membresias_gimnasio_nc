package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Factura;

@Repository
@Transactional
public class FacturaRepoImpl implements IFacturaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarFactura(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Factura obtenerFactura(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Factura.class, id);
	}

	@Override
	public void actualizarFactura(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.merge(factura);
	}

	@Override
	public void borrarFactura(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.obtenerFactura(id));
	}

}
