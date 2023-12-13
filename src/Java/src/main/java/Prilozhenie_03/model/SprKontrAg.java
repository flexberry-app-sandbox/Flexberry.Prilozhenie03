package Prilozhenie_03.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import Prilozhenie_03.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;


/**
 * Entity implementation class for Entity: СпрКонтрАг
 */
@Entity(name = "IISPrilozhenie_03СпрКонтрАг")
@Table(schema = "public", name = "СпрКонтрАг")
public class SprKontrAg {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "Наименование")
    private String наименование;

    @Column(name = "КПП")
    private Integer кпп;

    @Column(name = "Телефон")
    private Integer телефон;

    @Column(name = "ИНН")
    private Integer инн;

    @Column(name = "ОГРН")
    private Integer огрн;

    @Column(name = "КодОКВЭД")
    private Integer кодоквэд;

    @Column(name = "КодПоОКПО")
    private Integer кодпоокпо;

    @Column(name = "Код")
    private Integer код;


    public SprKontrAg() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getНаименование() {
      return наименование;
    }

    public void setНаименование(String наименование) {
      this.наименование = наименование;
    }

    public Integer getКПП() {
      return кпп;
    }

    public void setКПП(Integer кпп) {
      this.кпп = кпп;
    }

    public Integer getТелефон() {
      return телефон;
    }

    public void setТелефон(Integer телефон) {
      this.телефон = телефон;
    }

    public Integer getИНН() {
      return инн;
    }

    public void setИНН(Integer инн) {
      this.инн = инн;
    }

    public Integer getОГРН() {
      return огрн;
    }

    public void setОГРН(Integer огрн) {
      this.огрн = огрн;
    }

    public Integer getКодОКВЭД() {
      return кодоквэд;
    }

    public void setКодОКВЭД(Integer кодоквэд) {
      this.кодоквэд = кодоквэд;
    }

    public Integer getКодПоОКПО() {
      return кодпоокпо;
    }

    public void setКодПоОКПО(Integer кодпоокпо) {
      this.кодпоокпо = кодпоокпо;
    }

    public Integer getКод() {
      return код;
    }

    public void setКод(Integer код) {
      this.код = код;
    }


}