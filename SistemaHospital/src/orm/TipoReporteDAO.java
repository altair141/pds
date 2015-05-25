/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class TipoReporteDAO {
	public static TipoReporte loadTipoReporteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadTipoReporteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte getTipoReporteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return getTipoReporteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte loadTipoReporteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadTipoReporteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte getTipoReporteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return getTipoReporteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte loadTipoReporteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (TipoReporte) session.load(orm.TipoReporte.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte getTipoReporteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (TipoReporte) session.get(orm.TipoReporte.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte loadTipoReporteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TipoReporte) session.load(orm.TipoReporte.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte getTipoReporteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TipoReporte) session.get(orm.TipoReporte.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoReporte(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return queryTipoReporte(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoReporte(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return queryTipoReporte(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte[] listTipoReporteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return listTipoReporteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte[] listTipoReporteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return listTipoReporteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoReporte(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.TipoReporte as TipoReporte");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoReporte(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.TipoReporte as TipoReporte");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipoReporte", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte[] listTipoReporteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTipoReporte(session, condition, orderBy);
			return (TipoReporte[]) list.toArray(new TipoReporte[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte[] listTipoReporteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTipoReporte(session, condition, orderBy, lockMode);
			return (TipoReporte[]) list.toArray(new TipoReporte[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte loadTipoReporteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadTipoReporteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte loadTipoReporteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadTipoReporteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte loadTipoReporteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		TipoReporte[] tipoReportes = listTipoReporteByQuery(session, condition, orderBy);
		if (tipoReportes != null && tipoReportes.length > 0)
			return tipoReportes[0];
		else
			return null;
	}
	
	public static TipoReporte loadTipoReporteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		TipoReporte[] tipoReportes = listTipoReporteByQuery(session, condition, orderBy, lockMode);
		if (tipoReportes != null && tipoReportes.length > 0)
			return tipoReportes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipoReporteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return iterateTipoReporteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoReporteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return iterateTipoReporteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoReporteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.TipoReporte as TipoReporte");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoReporteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.TipoReporte as TipoReporte");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipoReporte", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte createTipoReporte() {
		return new orm.TipoReporte();
	}
	
	public static boolean save(orm.TipoReporte tipoReporte) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().saveObject(tipoReporte);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.TipoReporte tipoReporte) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().deleteObject(tipoReporte);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.TipoReporte tipoReporte)throws PersistentException {
		try {
			orm.Reporte[] lReportes = tipoReporte.reporte.toArray();
			for(int i = 0; i < lReportes.length; i++) {
				lReportes[i].setIdTipoReporte(null);
			}
			return delete(tipoReporte);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.TipoReporte tipoReporte, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Reporte[] lReportes = tipoReporte.reporte.toArray();
			for(int i = 0; i < lReportes.length; i++) {
				lReportes[i].setIdTipoReporte(null);
			}
			try {
				session.delete(tipoReporte);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.TipoReporte tipoReporte) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().getSession().refresh(tipoReporte);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.TipoReporte tipoReporte) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().getSession().evict(tipoReporte);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoReporte loadTipoReporteByCriteria(TipoReporteCriteria tipoReporteCriteria) {
		TipoReporte[] tipoReportes = listTipoReporteByCriteria(tipoReporteCriteria);
		if(tipoReportes == null || tipoReportes.length == 0) {
			return null;
		}
		return tipoReportes[0];
	}
	
	public static TipoReporte[] listTipoReporteByCriteria(TipoReporteCriteria tipoReporteCriteria) {
		return tipoReporteCriteria.listTipoReporte();
	}
}
