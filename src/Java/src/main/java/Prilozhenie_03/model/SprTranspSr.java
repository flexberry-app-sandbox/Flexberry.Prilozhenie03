package Prilozhenie_03.model;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import Prilozhenie_03.utils.UUIDConverter;

import javax.persistence.*;
import java.util.UUID;


/**
 * Entity implementation class for Entity: СпрТранспСр
 */
@Entity(name = "IISPrilozhenie_03СпрТранспСр")
@Table(schema = "public", name = "СпрТранспСр")
public class SprTranspSr {

    @Id
    @Converter(converterClass = UUIDConverter.class, name = "primarykey")
    @Convert("primarykey")
    @Column(name = "primarykey", length = 16, unique = true, nullable = false)
    private UUID primarykey;

    @Column(name = "ГрузПодъемВТон")
    private String грузподъемвтон;

    @Column(name = "ГосНомер")
    private String госномер;

    @Column(name = "Код")
    private Integer код;

    @Column(name = "ЛицеКартНомер")
    private Integer лицекартномер;

    @Column(name = "ВидПеревоз")
    private String видперевоз;

    @Column(name = "Марка")
    private String марка;

    @Column(name = "Наименование")
    private String наименование;


    public SprTranspSr() {
        super();
    }

    public void setPrimarykey(UUID primarykey) {
        this.primarykey = primarykey;
    }

    public UUID getPrimarykey() {
        return primarykey;
    }

    public String getГрузПодъемВТон() {
      return грузподъемвтон;
    }

    public void setГрузПодъемВТон(String грузподъемвтон) {
      this.грузподъемвтон = грузподъемвтон;
    }

    public String getГосНомер() {
      return госномер;
    }

    public void setГосНомер(String госномер) {
      this.госномер = госномер;
    }

    public Integer getКод() {
      return код;
    }

    public void setКод(Integer код) {
      this.код = код;
    }

    public Integer getЛицеКартНомер() {
      return лицекартномер;
    }

    public void setЛицеКартНомер(Integer лицекартномер) {
      this.лицекартномер = лицекартномер;
    }

    public String getВидПеревоз() {
      return видперевоз;
    }

    public void setВидПеревоз(String видперевоз) {
      this.видперевоз = видперевоз;
    }

    public String getМарка() {
      return марка;
    }

    public void setМарка(String марка) {
      this.марка = марка;
    }

    public String getНаименование() {
      return наименование;
    }

    public void setНаименование(String наименование) {
      this.наименование = наименование;
    }


}