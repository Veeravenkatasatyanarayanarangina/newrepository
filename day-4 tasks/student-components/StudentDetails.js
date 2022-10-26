import React from "react";
import StudentList from "./StudentsList";
import "./studentstyle.css"

class Students extends React.Component {
    constructor() {
        super()

        this.state = {
            student_Name: '',
            student_Id: '',
            student_Age: '',
            student_Branch: '',
            student_Address: '',
            students: []
        }
    }
    saveStudent(event) {
        event.preventDefault();
        let students = this.state.students;
        let student = {
            student_Name: this.state.student_Name,
            student_Id: this.state.student_Id,
            student_Age: this.state.student_Age,
            student_Branch: this.state.student_Branch,
            student_Address: this.state.student_Address
        }
        students.push(student);
        this.setState({ students: students });
       this.showtable()
       
    }
   
    changeName(event) {
        this.setState({ student_Name: event.target.value })

    }
    changeId(event) {
        this.setState({ student_Id: event.target.value })
    }
    changeAge(event) {
        this.setState({ student_Age: event.target.value })
    }

    changeBranch(event) {

        this.setState({ student_Branch: event.target.value })
    }
    changeAddress(event) {
        this.setState({ student_Address: event.target.value })

    }

    render() {
        return <div id="studenthome"><div id="stdregform">
            <h1> Student Register </h1>
<table>
            <tr><td><label>Student Name   :</label></td>
            <td><input type="text"  name="sname" value={this.state.student_Name}   onChange={(e)=>this.changeName(e)} /></td></tr><br></br><br></br>
            <tr><td><label>Student Id   :</label></td>
           <td> <input type="number"  name="sid" value={this.state.student_Id} onChange={(e)=>this.changeId(e)}  /></td></tr><br></br><br></br>
            <tr><td> <label>Student Age  :</label></td>
            <td><input type="number"  name="sage" value={this.state.student_Age} onChange={(e)=>this.changeAge(e)}  /></td></tr><br></br><br></br>
            <tr><td><label>Student Branch  :</label></td>
            <td><input type="text"  name="branch" value={this.state.student_Branch} onChange={(e)=>this.changeBranch(e)} /></td></tr><br></br><br></br>
           <tr><td> <label>Student Address  :</label></td>
          <td> <input type="text"  name="address" value={this.state.student_Address} onChange={(e)=>this.changeAddress(e)} /></td></tr><br></br><br></br>

          <tr><td><button  onClick={(e)=>this.saveStudent(e)}>SAVE</button></td></tr>
            </table>
        </div>
        <div id="listdiv">
       
        </div>

        <StudentList students={this.state.students} />
        </div >
    }
}
export default Students