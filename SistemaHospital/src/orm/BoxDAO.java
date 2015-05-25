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

public class BoxDAO {
	public static Box loadBoxByORMID(int idHabitacion) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadBoxByORMID(session, idHabitacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box getBoxByORMID(int idHabitacion) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return getBoxByORMID(session, idHabitacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box loadBoxByORMID(int idHabitacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadBoxByORMID(session, idHabitacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box getBoxByORMID(int idHabitacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return getBoxByORMID(session, idHabitacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box loadBoxByORMID(PersistentSession session, int idHabitacion) throws PersistentException {
		try {
			return (Box) session.load(orm.Box.class, new Integer(idHabitacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box getBoxByORMID(PersistentSession session, int idHabitacion) throws PersistentException {
		try {
			return (Box) session.get(orm.Box.class, new Integer(idHabitacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box loadBoxByORMID(PersistentSession session, int idHabitacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Box) session.load(orm.Box.class, new Integer(idHabitacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box getBoxByORMID(PersistentSession session, int idHabitacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Box) session.get(orm.Box.class, new Integer(idHabitacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBox(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return queryBox(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBox(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return queryBox(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box[] listBoxByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return listBoxByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box[] listBoxByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return listBoxByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBox(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Box as Box");
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
	
	public static List queryBox(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Box as Box");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Box", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box[] listBoxByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBox(session, condition, orderBy);
			return (Box[]) list.toArray(new Box[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box[] listBoxByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBox(session, condition, orderBy, lockMode);
			return (Box[]) list.toArray(new Box[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box loadBoxByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadBoxByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box loadBoxByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return loadBoxByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box loadBoxByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Box[] boxs = listBoxByQuery(session, condition, orderBy);
		if (boxs != null && boxs.length > 0)
			return boxs[0];
		else
			return null;
	}
	
	public static Box loadBoxByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Box[] boxs = listBoxByQuery(session, condition, orderBy, lockMode);
		if (boxs != null && boxs.length > 0)
			return boxs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBoxByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return iterateBoxByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBoxByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.AsddsapdsPersistentManager.instance().getSession();
			return iterateBoxByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBoxByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Box as Box");
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
	
	public static java.util.Iterator iterateBoxByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Box as Box");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Box", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box createBox() {
		return new orm.Box();
	}
	
	public static boolean save(orm.Box box) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().saveObject(box);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Box box) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().deleteObject(box);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Box box)throws PersistentException {
		try {
			orm.HoraMedica[] lHoraMedicas = box.horaMedica.toArray();
			for(int i = 0; i < lHoraMedicas.length; i++) {
				lHoraMedicas[i].setIdBox(null);
			}
			return delete(box);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Box box, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.HoraMedica[] lHoraMedicas = box.horaMedica.toArray();
			for(int i = 0; i < lHoraMedicas.length; i++) {
				lHoraMedicas[i].setIdBox(null);
			}
			try {
				session.delete(box);
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
	
	public static boolean refresh(orm.Box box) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().getSession().refresh(box);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Box box) throws PersistentException {
		try {
			orm.AsddsapdsPersistentManager.instance().getSession().evict(box);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Box loadBoxByCriteria(BoxCriteria boxCriteria) {
		Box[] boxs = listBoxByCriteria(boxCriteria);
		if(boxs == null || boxs.length == 0) {
			return null;
		}
		return boxs[0];
	}
	
	public static Box[] listBoxByCriteria(BoxCriteria boxCriteria) {
		return boxCriteria.listBox();
	}
}
