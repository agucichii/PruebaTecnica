/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ricoh.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Registro}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Registro
 * @generated
 */
public class RegistroWrapper
	extends BaseModelWrapper<Registro>
	implements ModelWrapper<Registro>, Registro {

	public RegistroWrapper(Registro registro) {
		super(registro);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("registroId", getRegistroId());
		attributes.put("nombre", getNombre());
		attributes.put("apellido", getApellido());
		attributes.put("nacimiento", getNacimiento());
		attributes.put("correo", getCorreo());
		attributes.put("fechacreacion", getFechacreacion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long registroId = (Long)attributes.get("registroId");

		if (registroId != null) {
			setRegistroId(registroId);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String apellido = (String)attributes.get("apellido");

		if (apellido != null) {
			setApellido(apellido);
		}

		Date nacimiento = (Date)attributes.get("nacimiento");

		if (nacimiento != null) {
			setNacimiento(nacimiento);
		}

		String correo = (String)attributes.get("correo");

		if (correo != null) {
			setCorreo(correo);
		}

		Date fechacreacion = (Date)attributes.get("fechacreacion");

		if (fechacreacion != null) {
			setFechacreacion(fechacreacion);
		}
	}

	@Override
	public Registro cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the apellido of this registro.
	 *
	 * @return the apellido of this registro
	 */
	@Override
	public String getApellido() {
		return model.getApellido();
	}

	/**
	 * Returns the correo of this registro.
	 *
	 * @return the correo of this registro
	 */
	@Override
	public String getCorreo() {
		return model.getCorreo();
	}

	/**
	 * Returns the fechacreacion of this registro.
	 *
	 * @return the fechacreacion of this registro
	 */
	@Override
	public Date getFechacreacion() {
		return model.getFechacreacion();
	}

	/**
	 * Returns the nacimiento of this registro.
	 *
	 * @return the nacimiento of this registro
	 */
	@Override
	public Date getNacimiento() {
		return model.getNacimiento();
	}

	/**
	 * Returns the nombre of this registro.
	 *
	 * @return the nombre of this registro
	 */
	@Override
	public String getNombre() {
		return model.getNombre();
	}

	/**
	 * Returns the primary key of this registro.
	 *
	 * @return the primary key of this registro
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the registro ID of this registro.
	 *
	 * @return the registro ID of this registro
	 */
	@Override
	public long getRegistroId() {
		return model.getRegistroId();
	}

	/**
	 * Returns the uuid of this registro.
	 *
	 * @return the uuid of this registro
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the apellido of this registro.
	 *
	 * @param apellido the apellido of this registro
	 */
	@Override
	public void setApellido(String apellido) {
		model.setApellido(apellido);
	}

	/**
	 * Sets the correo of this registro.
	 *
	 * @param correo the correo of this registro
	 */
	@Override
	public void setCorreo(String correo) {
		model.setCorreo(correo);
	}

	/**
	 * Sets the fechacreacion of this registro.
	 *
	 * @param fechacreacion the fechacreacion of this registro
	 */
	@Override
	public void setFechacreacion(Date fechacreacion) {
		model.setFechacreacion(fechacreacion);
	}

	/**
	 * Sets the nacimiento of this registro.
	 *
	 * @param nacimiento the nacimiento of this registro
	 */
	@Override
	public void setNacimiento(Date nacimiento) {
		model.setNacimiento(nacimiento);
	}

	/**
	 * Sets the nombre of this registro.
	 *
	 * @param nombre the nombre of this registro
	 */
	@Override
	public void setNombre(String nombre) {
		model.setNombre(nombre);
	}

	/**
	 * Sets the primary key of this registro.
	 *
	 * @param primaryKey the primary key of this registro
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the registro ID of this registro.
	 *
	 * @param registroId the registro ID of this registro
	 */
	@Override
	public void setRegistroId(long registroId) {
		model.setRegistroId(registroId);
	}

	/**
	 * Sets the uuid of this registro.
	 *
	 * @param uuid the uuid of this registro
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected RegistroWrapper wrap(Registro registro) {
		return new RegistroWrapper(registro);
	}

}