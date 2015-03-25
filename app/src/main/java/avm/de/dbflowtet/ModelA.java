package avm.de.dbflowtet;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKeyReference;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.raizlabs.android.dbflow.structure.container.ForeignKeyContainer;

/**
 * (c) AVM Berlin
 * Date: 23.03.2015
 * Time: 10:18
 */
@Table(databaseName = AppDatabase.NAME)
public class ModelA extends BaseModel {

    @Column(columnType = Column.PRIMARY_KEY)
    int id;

    @Column
    String name;

    @Column(name = "my_model_b", columnType = Column.FOREIGN_KEY,
            references = {@ForeignKeyReference(columnName = "modelB", foreignColumnName = "id", columnType = Integer.class)},
            saveForeignKeyModel = true)
    ModelB modelB;

    public ModelA() {
    }

    public ModelA(String name, ModelB modelB) {
        this.name = name;
        this.modelB = modelB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelB getModelB() {
        return modelB;
    }

    public void setModelB(ModelB modelB) {
        this.modelB = modelB;
    }
}
