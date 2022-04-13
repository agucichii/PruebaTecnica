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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.ricoh.service.http.RegistroServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RegistroSoap implements Serializable {

	public static RegistroSoap toSoapModel(Registro model) {
		RegistroSoap soapModel = new RegistroSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setRegistroId(model.getRegistroId());
		soapModel.setNombre(model.getNombre());
		soapModel.setApellido(model.getApellido());
		soapModel.setNacimiento(model.getNacimiento());
		soapModel.setCorreo(model.getCorreo());
		soapModel.setFechacreacion(model.getFechacreacion());

		return soapModel;
	}

	public static RegistroSoap[] toSoapModels(Registro[] models) {
		RegistroSoap[] soapModels = new RegistroSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RegistroSoap[][] toSoapModels(Registro[][] models) {
		RegistroSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RegistroSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RegistroSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RegistroSoap[] toSoapModels(List<Registro> models) {
		List<RegistroSoap> soapModels = new ArrayList<RegistroSoap>(
			models.size());

		for (Registro model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RegistroSoap[soapModels.size()]);
	}

	public RegistroSoap() {
	}

	public long getPrimaryKey() {
		return _registroId;
	}

	public void setPrimaryKey(long pk) {
		setRegistroId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getRegistroId() {
		return _registroId;
	}

	public void setRegistroId(long registroId) {
		_registroId = registroId;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public String getApellido() {
		return _apellido;
	}

	public void setApellido(String apellido) {
		_apellido = apellido;
	}

	public Date getNacimiento() {
		return _nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		_nacimiento = nacimiento;
	}

	public String getCorreo() {
		return _correo;
	}

	public void setCorreo(String correo) {
		_correo = correo;
	}

	public Date getFechacreacion() {
		return _fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		_fechacreacion = fechacreacion;
	}

	private String _uuid;
	private long _registroId;
	private String _nombre;
	private String _apellido;
	private Date _nacimiento;
	private String _correo;
	private Date _fechacreacion;

}