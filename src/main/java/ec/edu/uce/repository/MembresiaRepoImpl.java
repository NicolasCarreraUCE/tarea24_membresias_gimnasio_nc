package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Membresia;

@Repository
@Transactional
public class MembresiaRepoImpl implements IMembresiaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(membresia);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Membresia obtenerMembresia(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Membresia.class, id);
	}

	@Override
	public void actualizarMembresia(Membresia membresia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(membresia);
	}

	@Override
	public void borrarMembresia(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.obtenerMembresia(id));
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Membresia buscarMembresiaPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		TypedQuery<Membresia> myQuery = this.entityManager.createQuery("SELECT m FROM Membresia m WHERE m.codigo =:codigo", Membresia.class);
		myQuery.setParameter("codigo", codigo);
		return myQuery.getSingleResult();
	}

}
