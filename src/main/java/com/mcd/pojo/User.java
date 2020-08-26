package com.mcd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int BbookID;
    private String bookName;
    private int bookCounts;
    private String detail;

}
