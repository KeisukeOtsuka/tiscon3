package jp.co.tis.tiscon3.form;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class CardOrderForm extends FormBase {

    private static final long serialVersionUID = 1L;

    @NotBlank(message = "名前（漢字）を修正してください")
    @Size(max = 60)
    private String kanjiName;

    @NotBlank(message = "名前（カナ）を修正してください")
    @Size(max = 90)
    @Pattern(regexp = "^[ァ-ヶー 　]*$")
    private String kanaName;

    @NotBlank(message = "名前（ローマ字）を修正してください")
    @Size(max = 120)
    @Pattern(regexp = "^[a-zA-Z 　]*$")
    private String alphabetName;

    @NotBlank(message = "生年月日を修正して下さい")
    @Size(max = 10)
    @Pattern(regexp = "\\d{4}/\\d{1,2}/\\d{1,2}$")
    private String dateOfBirth;

    @NotBlank(message = "性別を選択してください")
    @Size(max = 6)
    private String gender;

    @NotBlank(message = "郵便番号を修正してください")
    @Size(max = 8)
    @Pattern(regexp = "^[0-9]{3}-[0-9]{4}$")
    private String zipCode;

    @NotBlank(message = "住所を修正してください")
    @Size(max = 255)
    private String address;

    @NotBlank(message = "自宅電話番号を修正してください")
    @Size(max = 13)
    @Pattern(regexp = "^0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4}$")
    private String homePhoneNumber;

    @Size(max = 13)
    @Pattern(regexp = "^((070|080|090)-[0-9]{4}-[0-9]{4})?$")
    private String mobilePhoneNumber;

    @NotBlank(message = "メールアドレスを修正してください")
    @Size(max = 255)
    @Email
    private String emailAddress;

    @NotBlank(message = "配偶者の有無を選択してください")
    @Size(max = 20)
    private String spouse;

    @NotBlank(message = "お住まいを選んでください")
    @Size(max = 20)
    private String houseClassification;

    @NotBlank(message = "ローン借入金額をを修正してください")
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String debt;

    @NotBlank(message = "ご職業を選択してください")
    @Size(max = 120)
    private String job;

    @NotBlank(message = "昨年の所得金額をを修正してください")
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String income;

    @Size(max = 255)
    private String employerName;

    @Size(max = 8)
    @Pattern(regexp = "^([0-9]{3}-[0-9]{4})?$")
    private String employerZipCode;

    @Size(max = 255)
    private String employerAddress;

    @Size(max = 13)
    @Pattern(regexp = "^(0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4})?$")
    private String employerPhoneNumber;

    @Size(max = 255)
    private String industryType;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String capital;

    @Size(max = 255)
    @Pattern(regexp = "[0-9]*")
    private String companySize;

    @Size(max = 255)
    private String position;

    @Size(max = 255)
    private String department;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String employeeLength;

}
