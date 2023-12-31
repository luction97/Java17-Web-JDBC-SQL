package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Cliente {

	String tipoDocumento;
	String descripcion;
	int nroDocumento;
	LocalDate fechanacimiento;
	ArrayList<Producto> listadoProductos;

	public Cliente() {
		super();
	}

	public Cliente(String tipoDocumento, String descripcion, int nroDocumento, LocalDate fechanacimiento,
			ArrayList<Producto> listadoProductos) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.descripcion = descripcion;
		this.nroDocumento = nroDocumento;
		this.fechanacimiento = fechanacimiento;
		this.listadoProductos = listadoProductos;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public ArrayList<Producto> getListadoProductos() {
		return listadoProductos;
	}

	public void setListadoProductos(ArrayList<Producto> listadoProductos) {
		this.listadoProductos = listadoProductos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripcion, fechanacimiento, listadoProductos, nroDocumento, tipoDocumento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(fechanacimiento, other.fechanacimiento)
				&& Objects.equals(listadoProductos, other.listadoProductos) && nroDocumento == other.nroDocumento
				&& Objects.equals(tipoDocumento, other.tipoDocumento);
	}

	@Override
	public String toString() {
		return "Cliente [tipoDocumento=" + tipoDocumento + ", descripcion=" + descripcion + ", nroDocumento="
				+ nroDocumento + ", fechanacimiento=" + fechanacimiento + ", listadoProductos=" + listadoProductos
				+ "]";
	}

}
