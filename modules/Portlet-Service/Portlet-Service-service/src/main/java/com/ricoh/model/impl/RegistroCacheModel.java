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

package com.ricoh.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.ricoh.model.Registro;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Registro in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RegistroCacheModel
	implements CacheModel<Registro>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RegistroCacheModel)) {
			return false;
		}

		RegistroCacheModel registroCacheModel = (RegistroCacheModel)object;

		if (registroId == registroCacheModel.registroId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, registroId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", registroId=");
		sb.append(registroId);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", apellido=");
		sb.append(apellido);
		sb.append(", nacimiento=");
		sb.append(nacimiento);
		sb.append(", correo=");
		sb.append(correo);
		sb.append(", fechacreacion=");
		sb.append(fechacreacion);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Registro toEntityModel() {
		RegistroImpl registroImpl = new RegistroImpl();

		if (uuid == null) {
			registroImpl.setUuid("");
		}
		else {
			registroImpl.setUuid(uuid);
		}

		registroImpl.setRegistroId(registroId);

		if (nombre == null) {
			registroImpl.setNombre("");
		}
		else {
			registroImpl.setNombre(nombre);
		}

		if (apellido == null) {
			registroImpl.setApellido("");
		}
		else {
			registroImpl.setApellido(apellido);
		}

		if (nacimiento == Long.MIN_VALUE) {
			registroImpl.setNacimiento(null);
		}
		else {
			registroImpl.setNacimiento(new Date(nacimiento));
		}

		if (correo == null) {
			registroImpl.setCorreo("");
		}
		else {
			registroImpl.setCorreo(correo);
		}

		if (fechacreacion == Long.MIN_VALUE) {
			registroImpl.setFechacreacion(null);
		}
		else {
			registroImpl.setFechacreacion(new Date(fechacreacion));
		}

		registroImpl.resetOriginalValues();

		return registroImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		registroId = objectInput.readLong();
		nombre = objectInput.readUTF();
		apellido = objectInput.readUTF();
		nacimiento = objectInput.readLong();
		correo = objectInput.readUTF();
		fechacreacion = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(registroId);

		if (nombre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (apellido == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(apellido);
		}

		objectOutput.writeLong(nacimiento);

		if (correo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(correo);
		}

		objectOutput.writeLong(fechacreacion);
	}

	public String uuid;
	public long registroId;
	public String nombre;
	public String apellido;
	public long nacimiento;
	public String correo;
	public long fechacreacion;

}