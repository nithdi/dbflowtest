package avm.de.dbflowtet;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * (c) AVM Berlin
 * Date: 23.03.2015
 * Time: 10:18
 */
@Table(databaseName = AppDatabase.NAME)
public class ModelC extends BaseModel {

    @Column(columnType = Column.PRIMARY_KEY_AUTO_INCREMENT)
    int id;

    @Column
    String pet;

    public ModelC() {
    }

    public ModelC(String pet) {
        this.pet = pet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }
}
