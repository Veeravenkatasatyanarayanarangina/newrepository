import React from "react";
import "./studentstyle.css"
class StudentList extends React.Component
{
    constructor(props){
        super(props)
        this.state={

        }
    }
    render()
    {
        return<div id="listdetails">
          <h2 >Student Details </h2>
          <table id="stdtable">
            <thead>
                <tr><th>Student Name</th>
                <th>Student Id</th>
                <th>Student Age</th>
                <th>Student Branch</th>
                <th>Student Address</th></tr>
            </thead>
            <tbody>
                {this.props.students.map((items)=>{
                    return <tr><td>{items.student_Name}</td><td>{items.student_Id}</td><td>{items.student_Age}</td><td>{items.student_Branch}</td><td>{items.student_Address}</td></tr>
                })}
            </tbody>
          </table>


        </div>
    }
}
export default StudentList 