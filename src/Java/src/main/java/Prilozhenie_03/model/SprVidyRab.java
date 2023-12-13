package Prilozhenie_03.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import Prilozhenie_03.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;

/**
 * Entity implementation class for Entity: СпрВидыРаб
 */
@Entity(name = "IISPrilozhenie_03СпрВидыРаб")
@Table(schema = "public", name = "СпрВидыРаб")
public class SprVidyRab {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "Код")
    private Integer код;

    @Column(name = "Наименование")
    private String наименование;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprTipTransSr")
    @Convert("SprTipTransSr")
    @Column(name = "СпрТипТрансСр", length = 16, unique = true, nullable = false)
    private UUID _sprtiptranssrid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprTipTransSr", insertable = false, updatable = false)
    private SprTipTransSr sprtiptranssr;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprEdIzmer")
    @Convert("SprEdIzmer")
    @Column(name = "СпрЕдИзмер", length = 16, unique = true, nullable = false)
    private UUID _spredizmerid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprEdIzmer", insertable = false, updatable = false)
    private SprEdIzmer spredizmer;


    public SprVidyRab() {
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