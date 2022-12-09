package entities;
public class Employe {

	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private String genre;

	private static int comp;

	public Employe(String nom, String prenom,String email,String password,String genre) {
                this.id=++comp;
		this.nom=nom;
                this.prenom=prenom;
                this.email=email;
                this.password=password;
                this.genre=genre;
	}

	public Employe(int id,String nom, String prenom,String email,String password,String genre) {
                this.id=id;
		this.nom=nom;
                this.prenom=prenom;
                this.email=email;
                this.password=password;
                this.genre=genre;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGenre() {
        return genre;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", password=" + password + ", genre=" + genre + '}';
    }

	
	
	
}
