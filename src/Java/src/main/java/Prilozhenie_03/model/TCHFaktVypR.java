package Prilozhenie_03.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import Prilozhenie_03.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;

/**
 * Entity implementation class for Entity: ТЧФактВыпР
 */
@Entity(name = "IISPrilozhenie_03ТЧФактВыпР")
@Table(schema = "public", name = "ТЧФактВыпР")
public class TCHFaktVypR {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "КлЧасНОб")
    private Float клчасноб;

    @Column(name = "ВрПриб")
    private String врприб;

    @Column(name = "ОбГруз")
    private Float обгруз;

    @Column(name = "КолЧасПр")
    private Float колчаспр;

    @Column(name = "ВрУб")
    private String вруб;

    @Column(name = "КолЧасРаб")
    private Float колчасраб;

    @Column(name = "ОбРаб")
    private String обраб;

    @Column(name = "КдПрост")
    private Float кдпрост;

    @Column(name = "СтатЗатр")
    private String статзатр;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprTipTransSr")
    @Convert("SprTipTransSr")
    @Column(name = "СпрТипТрансСр", length = 16, unique = true, nullable = false)
    private UUID _sprtiptranssrid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprTipTransSr", insertable = false, updatable = false)
    private SprTipTransSr sprtiptranssr;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprNomen")
    @Convert("SprNomen")
    @Column(name = "СпрНомен", length = 16, unique = true, nullable = false)
    private UUID _sprnomenid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprNomen", insertable = false, updatable = false)
    private SprNomen sprnomen;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprKontrAg")
    @Convert("SprKontrAg")
    @Column(name = "СпрКонтрАг", length = 16, unique = true, nullable = false)
    private UUID _sprkontragid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprKontrAg", insertable = false, updatable = false)
    private SprKontrAg sprkontrag;

    @EdmIgnore
    @Converter(converterClass = UUIDConverter.class, name = "SprVidyRab")
    @Convert("SprVidyRab")
    @Column(name = "СпрВидыРаб", length = 16, unique = true, nullable = false)
    private UUID _sprvidyrabid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SprVidyRab", insertable = false, updatable = false)
    private SprVidyRab sprvidyrab;

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
    @Converter(converterClass = UUIDConverter.class, name = "FaktVypolRab")
    @Convert("FaktVypolRab")
    @Column(name = "ФактВыполРаб", length = 16, unique = true, nullable = false)
    private UUID _faktvypolrabid;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "FaktVypolRab", insertable = false, updatable = false)
    private FaktVypolRab faktvypolrab;


    public TCHFaktVypR() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public Float getКлЧасНОб() {
      return клчасноб;
    }

    public void setКлЧасНОб(Float клчасноб) {
      this.клчасноб = клчасноб;
    }

    public String getВрПриб() {
      return врприб;
    }

    public void setВрПриб(String врприб) {
      this.врприб = врприб;
    }

    public Float getОбГруз() {
      return обгруз;
    }

    public void setОбГруз(Float обгруз) {
      this.обгруз = обгруз;
    }

    public Float getКолЧасПр() {
      return колчаспр;
    }

    public void setКолЧасПр(Float колчаспр) {
      this.колчаспр = колчаспр;
    }

    public String getВрУб() {
      return вруб;
    }

    public void setВрУб(String вруб) {
      this.вруб = вруб;
    }

    public Float getКолЧасРаб() {
      return колчасраб;
    }

    public void setКолЧасРаб(Float колчасраб) {
      this.колчасраб = колчасраб;
    }

    public String getОбРаб() {
      return обраб;
    }

    public void setОбРаб(String обраб) {
      this.обраб = обраб;
    }

    public Float getКдПрост() {
      return кдпрост;
    }

    public void setКдПрост(Float кдпрост) {
      this.кдпрост = кдпрост;
    }

    public String getСтатЗатр() {
      return статзатр;
    }

    public void setСтатЗатр(String статзатр) {
      this.статзатр = статзатр;
    }


}