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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;agu_Registro&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Registro
 * @generated
 */
public class RegistroTable extends BaseTable<RegistroTable> {

	public static final RegistroTable INSTANCE = new RegistroTable();

	public final Column<RegistroTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RegistroTable, Long> registroId = createColumn(
		"registroId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<RegistroTable, String> nombre = createColumn(
		"nombre", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RegistroTable, String> apellido = createColumn(
		"apellido", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RegistroTable, Date> nacimiento = createColumn(
		"nacimiento", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RegistroTable, String> correo = createColumn(
		"correo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RegistroTable, Date> fechacreacion = createColumn(
		"fechacreacion", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private RegistroTable() {
		super("agu_Registro", RegistroTable::new);
	}

}