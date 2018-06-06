package vn.lgsp.fw.app.cmon.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Danh muc Don Vi Hanh Chinh
 * @author caltalys
 *
 */
@Entity
@Table(name="app_vaitro")
@Data
@ToString
@EqualsAndHashCode(callSuper=true)	
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class VaiTro extends BaseEntity<VaiTro>{
	
	private static final long serialVersionUID = -5551311878392114212L;
	
	@NotBlank
	@Size(max=255)
	private String ten = "";
}
