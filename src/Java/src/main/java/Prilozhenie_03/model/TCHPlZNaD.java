package Prilozhenie_03.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import Prilozhenie_03.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import java.util.Date;

/**
 * Entity implementation class for Entity: ТЧПлЗНаД
 */
@Entity(name = "IISPrilozhenie_03ТЧПлЗНаД")
@Table(schema = "public", name = "ТЧПлЗНаД")
public class TCHPlZNaD {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "КолЧас")
    private Float колчас;

    @Column(name = "ОбГруз")
    private Float обгруз;

    @Column(name = "ОбРаб")
    private String обраб;

    @Column(name = "ВремПриб")
    private Date времприб;

    @Column(name = "СтЗатрат")
    private String стзатрат;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprTipTransSr")
    @Convert("SprTipTransSr")
    @Column(name = "СпрТипТрансСр", length = 16, unique = true, nullable = false)
    private UUID _sprtiptranssrid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprTipTransSr", insertable = false, updatable = false)
    private SprTipTransSr sprtiptranssr;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprTranspSr")
    @Convert("SprTranspSr")
    @Column(name = "СпрТранспСр", length = 16, unique = true, nullable = false)
    private UUID _sprtranspsrid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprTranspSr", insertable = false, updatable = false)
    private SprTranspSr sprtranspsr;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprEdIzmer")
    @Convert("SprEdIzmer")
    @Column(name = "СпрЕдИзмер", length = 16, unique = true, nullable = false)
    private UUID _spredizmerid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprEdIzmer", insertable = false, updatable = false)
    private SprEdIzmer spredizmer;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprNomen")
    @Convert("SprNomen")
    @Column(name = "СпрНомен", length = 16, unique = true, nullable = false)
    private UUID _sprnomenid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprNomen", insertable = false, updatable = false)
    private SprNomen sprnomen;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprVidyRab")
    @Convert("SprVidyRab")
    @Column(name = "СпрВидыРаб", length = 16, unique = true, nullable = false)
    private UUID _sprvidyrabid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprVidyRab", insertable = false, updatable = false)
    private SprVidyRab sprvidyrab;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprKontrAg")
    @Convert("SprKontrAg")
    @Column(name = "СпрКонтрАг", length = 16, unique = true, nullable = false)
    private UUID _sprkontragid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprKontrAg", insertable = false, updatable = false)
    private SprKontrAg sprkontrag;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "DokPlanZaNaD")
    @Convert("DokPlanZaNaD")
    @Column(name = "ДокПланЗаНаД", length = 16, unique = true, nullable = false)
    private UUID _dokplanzanadid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "DokPlanZaNaD", insertable = false, updatable = false)
    private DokPlanZaNaD dokplanzanad;


    public TCHPlZNaD() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public Float getКолЧас() {
      return колчас;
    }

    public void setКолЧас(Float колчас) {
      this.колчас = колчас;
    }

    public Float getОбГруз() {
      return обгруз;
    }

    public void setОбГруз(Float обгруз) {
      this.обгруз = обгруз;
    }

    public String getОбРаб() {
      return обраб;
    }

    public void setОбРаб(String обраб) {
      this.обраб = обраб;
    }

    public Date getВремПриб() {
      return времприб;
    }

    public void setВремПриб(Date времприб) {
      this.времприб = времприб;
    }

    public String getСтЗатрат() {
      return стзатрат;
    }

    public void setСтЗатрат(String стзатрат) {
      this.стзатрат = стзатрат;
    }


}