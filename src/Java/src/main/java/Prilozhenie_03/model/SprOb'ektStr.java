package Prilozhenie_03.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import Prilozhenie_03.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;


/**
 * Entity implementation class for Entity: СпрОбъектСтр
 */
@Entity(name = "IISPrilozhenie_03СпрОбъектСтр")
@Table(schema = "public", name = "СпрОбъектСтр")
public class SprOb'ektStr {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "Код")
    private Integer код;

    @Column(name = "Наименование")
    private String наименование;


    public SprOb'ektStr() {
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