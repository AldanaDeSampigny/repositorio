package facultad;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
	private int codigo; 
	private String nombre;
	private String apellido; 
	private ArrayList<Materia> materiasDadas;
	private DatosPersonal datosPersonal; 

	public Profesor(int codigo, String nombre, String apellido, Materia materiaDada) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.materiasDadas = new ArrayList<Materia>();
		this.materiasDadas.add(materiaDada);
	}

	public Profesor(int codigo, String nombre, String apellido, Materia materiaDada,DatosPersonal datoPersonal) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.datosPersonal = datoPersonal;
		this.materiasDadas = new ArrayList<Materia>();
		this.materiasDadas.add(materiaDada);
	}
	
	public DatosPersonal getDatosPersonal() {
		return this.datosPersonal;
	}
	
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	public void agregarMateria(Materia materia) {
		
		if(materiasDadas.contains(materia)){
			throw new MateriaRepetidaException("materia repetida");
		}
		else
			materiasDadas.add(materia);
	}
	
	public List<Materia> getMateriasDadas(){
		return this.materiasDadas;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (codigo != other.codigo)
			return false;
	
		
		return true;
	}

}
