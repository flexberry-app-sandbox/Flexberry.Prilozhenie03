package Prilozhenie_03.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import Prilozhenie_03.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;


/**
 * Entity implementation class for Entity: СпрТипТрансСр
 */
@Entity(name = "IISPrilozhenie_03СпрТипТрансСр")
@Table(schema = "public", name = "СпрТипТрансСр")
public class SprTipTransSr {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "Описание")
    private String описание;

    @Column(name = "Код")
    private Integer код;

    @Column(name = "Наименование")
    private String наименование;

    @Column(name = "ВместВКубМ")
    private Float вмествкубм;


    public SprTipTransSr() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getОписание() {
      return описание;
    }

    public void setОписание(String описание) {
      this.описание = описание;
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

    public Float getВместВКубМ() {
      return вмествкубм;
    }

    public void setВместВКубМ(Float вмествкубм) {
      this.вмествкубм = вмествкубм;
    }


}