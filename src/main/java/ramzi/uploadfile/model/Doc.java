package ramzi.uploadfile.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="docs")
@Data
public class Doc {

    public Doc() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String docName;
    private String docType;

    @Lob
    private byte[] data;

    public Doc(String docName, String docType, byte[] data) {
        super();
        this.docName = docName;
        this.docType = docType;
        this.data = data;
    }
}
