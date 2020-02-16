class GradeSchool {
  private roster: Map<string, string[]>

  constructor() {
    this.roster = new Map();
  }

  studentRoster(): Map<string, string[]> {
    return this.roster;
  }

  addStudent(name: string, grade: number): void {
    const oldStudents = this.studentsInGrade(grade);
    const newStudents = oldStudents.concat([name]).sort();

    this.roster.set(grade.toString(), newStudents);
  }

  studentsInGrade(grade: number): string[] {
    return this.roster.get(grade.toString()) || [];
  }
}

export default GradeSchool;
