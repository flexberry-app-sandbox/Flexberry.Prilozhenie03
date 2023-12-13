package Prilozhenie_03.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import Prilozhenie_03.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import java.util.Date;
import java.util.List;

/**
 * Entity implementation class for Entity: ДокПланЗаНаД
 */
@Entity(name = "IISPrilozhenie_03ДокПланЗаНаД")
@Table(schema = "public", name = "ДокПланЗаНаД")
public class DokPlanZaNaD {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "Дата")
    private Date дата;

    @Column(name = "Номер")
    private Integer номер;

    @Column(name = "Время")
    private String время;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprPolzov")
    @Convert("SprPolzov")
    @Column(name = "СпрПользов", length = 16, unique = true, nullable = false)
    private UUID _sprpolzovid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprPolzov", insertable = false, updatable = false)
    private SprPolzov sprpolzov;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprOb'ektStr")
    @Convert("SprOb'ektStr")
    @Column(name = "СпрОбъектСтр", length = 16, unique = true, nullable = false)
    private UUID _sprob'ektstrid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprOb'ektStr", insertable = false, updatable = false)
    private SprOb'ektStr sprob'ektstr;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprKontrAg")
    @Convert("SprKontrAg")
    @Column(name = "СпрКонтрАг", length = 16, unique = true, nullable = false)
    private UUID _sprkontragid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprKontrAg", insertable = false, updatable = false)
    private SprKontrAg sprkontrag;

    @OneToMany(mappedBy = "dokplanzanad", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<TCHPlZNaD> tchplznads;


    public DokPlanZaNaD() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public Date getДата() {
      return дата;
    }

    public void setДата(Date дата) {
      this.дата = дата;
    }

    public Integer getНомер() {
      return номер;
    }

    public void setНомер(Integer номер) {
      this.номер = номер;
    }

    public String getВремя() {
      return время;
    }

    public void setВремя(String время) {
      this.время = время;
    }


}