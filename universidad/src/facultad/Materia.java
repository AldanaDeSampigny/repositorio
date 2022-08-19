package facultad;

import java.util.ArrayList;

public class Materia{
    private int codigo; 
    private String nombre; 
    private ArrayList<Materia> correlativas;


    public Materia(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
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

    public void agregarCorrelativa(Materia materia) {
    	Materia nuevaCorrelativa = new Materia(materia.getCodigo(),materia.getNombre());
    	if(correlativas.contains(materia)) {
    		throw new MateriaRepetidaException("materia Repetida");
    	}
    	else{
    		correlativas.add(nuevaCorrelativa);
    	}
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		if (codigo != other.codigo)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

    
}