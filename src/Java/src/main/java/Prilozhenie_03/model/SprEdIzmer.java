package Prilozhenie_03.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import Prilozhenie_03.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;


/**
 * Entity implementation class for Entity: СпрЕдИзмер
 */
@Entity(name = "IISPrilozhenie_03СпрЕдИзмер")
@Table(schema = "public", name = "СпрЕдИзмер")
public class SprEdIzmer {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "Код")
    private Integer код;

    @Column(name = "Наименование")
    private String наименование;


    public SprEdIzmer() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public Integer getКод() {
      return код;
    }

    public void setКод(Integer код) {
      this.код = код;
    }

    public String getНаименование() {
      return наименование;
    }

    public void setНаименование(String наименование) {
      this.наименование = наименование;
    }


}